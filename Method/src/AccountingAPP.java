public class AccountingAPP {
    //최상위 클래스에서 전역변수로 사용하기
    //공급가액
   public static double ValueOfSupply = 10000.0;

    //부가가치세율
   public static double VatRate = 0.1;

    public static double  getVAT(){
        return ValueOfSupply * VatRate;
    }

    public static double getTotal() {
        return ValueOfSupply + getVAT();
    }
    public static void main(String[] args) {

        //다른 곳에서 메서드를 불러오면 메인에서는 이렇게 더럽게 짤 필요가 없다.
        //부가세
        //double VAT = ValueOfSupply * VatRate;
        //double VAT = getVAT();

        //합계
        //double total = ValueOfSupply + VAT;
        //double total = getTotal();

        //출력
        System.out.println("Value Of Supply : " + ValueOfSupply);
        System.out.println("VAT : "+ getVAT());
        System.out.println("Total : "+ getTotal());
    }
}
