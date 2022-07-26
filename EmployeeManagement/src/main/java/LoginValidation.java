

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String emailID = request.getParameter("emailId");
		String password = request.getParameter("pswd");
		
		System.out.println(emailID);
		System.out.println(password);
		
		try {
			if(validate(emailID,password)) {
				//out.println("Welcome " + emailID);
				HttpSession session = request.getSession(); // 
				session.setAttribute("email", emailID); // email = emailID
				
				session.setAttribute("empName", getEmployeeName(emailID));
				session.setAttribute("empNo", getEmpNo(emailID));
				response.sendRedirect("Home");
			}
			else {
			
				out.print("<html><body><div style = 'color :red;'><h4>Invalid Credentials</h4></div></body></html>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
				dispatcher.include(request, response);
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private boolean validate(String emailID, String password) throws SQLException, ClassNotFoundException {
	
		Connection connect = getConnection();
		PreparedStatement p = connect.prepareStatement("select emailID , password from LoginCredential where emailID = ? and password = ?");
		p.setString(1, emailID);
		p.setString(2, password);
		
		ResultSet r = p.executeQuery();
		if(r.next())
			return true;
		
		return false;
	}
	
	public String getEmployeeName(String emailID) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		PreparedStatement p = connect.prepareStatement("select EName from Employee where EmpNo=(select EmpNo from LoginCredential where emailID = ? )");
		p.setString(1, emailID);
		
		ResultSet rs = p.executeQuery();
		if(rs.next())
			return rs.getString(1);
		return null;
	}
	
public int getEmpNo(String emailID) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		PreparedStatement p = connect.prepareStatement("select EmpNo from LoginCredential  where emailID = ? ");
		p.setString(1, emailID);
		
		ResultSet rs = p.executeQuery();
		if(rs.next())
			return rs.getInt(1);
		return 0;
	}


	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystem","shriyash","shri7727");
		
		
		
		
		
	}

	

}