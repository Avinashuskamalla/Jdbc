package com.id;

public interface Query {

String	sql ="Select name,salary  from  emp";

String sql1 ="update   emp set name='shanku' where salary=34000";

String sql2 = "insert into emp values('rithika',10000)";

String sql3 ="delete from emp where salary=10000";

String sql4="select * from emp";

String sql5="insert into emp values(?,?)";

String sql6="select * from emp where salary=? ";
	
}
