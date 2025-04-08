package Programs;

import java.sql.SQLException;

public class ExceptionCustom extends Exception{

    ExceptionCustom(String ageisnotvalid){
            super();
        }
        static  void validate(int age) throws SQLException {
            if (age<18){
                throw new SQLException("age is not valid to vote");
            }else{
                System.out.println("age is valid to vote");
            }
        }
        public static void main(String args[])throws SQLException{
            try{
                validate(13);
            }
            catch (SQLException a){
                System.out.println("caugth the exception");
                System.out.println("exception Occured"+a);
            }
            System.out.println("rest of the code");
        }

    }

