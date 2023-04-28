public class ArithmeticOperation {
    private int operand1;
    private int operand2;

    public ArithmeticOperation(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2=operand2;
    }
    public int getOperand1(){
        return operand1;
    }
    public int getOperand2(){
        return operand2;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    public int add()throws ArithmeticException {
        if(operand1 <0 || operand2<0){
            throw new ArithmeticException("Negative Numbers are NOT ALLOWED❌");
        }
        return operand1 + operand2;
    }
    public int substract()throws ArithmeticException{
        if(operand1<0 || operand2<0){
            throw  new ArithmeticException("Negative Numbers are NOT ALLOWED❌");
        }
        if(operand1> operand2){
            return operand1 - operand2;
        }else return operand2 - operand1;
    }
    public int multiply()throws ArithmeticException{
        if(operand1 == 0 || operand2 == 0){
            throw new ArithmeticException("Zero Numbers are NOT ALLOWED❌");
        }
        return operand1 * operand2;
    }
    public double divide()throws ArithmeticException{
        if(operand1 == 0 || operand2 == 0){
            throw new ArithmeticException("Zero Numbers are NOT ALLOWED❌");
        }
        if(operand1>operand2) return (double)operand1 / operand2;
        else return (double) operand2/operand1;
    }
}
