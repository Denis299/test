package Les9.utils;

public class Checker {
    public int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
        //       if (companyName =="Google"|| companyName == "Amazon"){
//            return false;
//        }
        if (companyNamesValidatedCount > 10) {
            return false;
        }
        companyNamesValidatedCount++;
        return (companyName != "Google" && companyName != "Amazon");
    }
}
