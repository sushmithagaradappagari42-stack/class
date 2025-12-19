class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        double taxAmount = 0;

        if (!isIndian) {
            throw new CountryNotValidException(
                "The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.equals("")) {
            throw new EmployeeNameInvalidException(
                "The employee name cannot be empty");
        }

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } 
        else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } 
        else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } 
        else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } 
        else {
            throw new TaxNotEligibleException(
                "The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {

    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();

        try {
            
            String empName = "Jack";
            boolean isIndian = true;
            double empSal = 55000;

            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);

        } catch (CountryNotValidException e) {
            e.printStackTrace();
            System.out.println(
                "The employee should be an Indian citizen for calculating tax");

        } catch (EmployeeNameInvalidException e) {
            e.printStackTrace();
            System.out.println(
                "The employee name cannot be empty");

        } catch (TaxNotEligibleException e) {
            e.printStackTrace();
            System.out.println(
                "The employee does not need to pay tax");
        }
    }
}