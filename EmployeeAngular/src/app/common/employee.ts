export class Employee {

    constructor(
        public empno : number,
        public ename : string,
        public job : string,
        public hiredate : Date | null,
        public managerID : number,
        public salary : number,
        public commission : number,
        public deptno : number

    ){
    }
}
