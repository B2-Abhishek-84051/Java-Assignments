package com.bank.tester;
import com.bank.info.*;

public class Main {
    public static void main(String[] args) {
        Bank.dispBankInfo();
        Bank.acceptBankInfo();
        Bank.addCustomer();
        Bank.dispBankInfo();
        Customer.dispCustomerInfo();
        Customer.addbalance();
        Customer.dispCustomerInfo();
        BankEmployee.acceptEmpInfo();
        BankEmployee.dispEmpInfo();
    }
}
