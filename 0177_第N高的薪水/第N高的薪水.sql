CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    # �������
    declare p int;
    # ������ֵ
    set p=n-1;
RETURN (      
        select ifnull(
                        (
                        # LIMIT a OFFSET b ����  
                        #select distinct salary from employee order by salary desc limit 1 OFFSET P

                        # LIMIT a,b ����
                        select distinct salary from employee order by salary desc limit P,1
                        ),null) as SecondHighestSalary 
        );     
END
