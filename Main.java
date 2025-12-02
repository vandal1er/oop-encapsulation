public class Main {
  public static void main(String[] args) {
    SecureAccount acc = new SecureAccount("2025-001", "Alice", 1000.0, "pass123");
    
    
    System.out.println("Trying to view account number with wrong key:");
    System.out.println(acc.getAccountNumber("wrong"));
    
    
    System.out.println("Trying with correct key:");
    System.out.println(acc.getAccountNumber("pass123"));
    
    
    System.out.println("Changing passkey...");
    System.out.println(acc.changePasskey("pass123", "newkey"));
    
    
    System.out.println("Trying old key:");
    System.out.println(acc.getAccountNumber("pass123"));
    
    
    System.out.println("Trying new key:");
    System.out.println(acc.getAccountNumber("newkey"));
    
    
    acc.deposit(500);
    acc.withdraw(200);
    System.out.println("Balance after transactions: " + acc.getBalance());
  }
}
