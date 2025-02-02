import com.kodtodya.practice.abstraction.service.SBIBankService;

public class BankAbstractionDemo {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.openAccount();
        sbiBankService.disburseLoan();
    }
}