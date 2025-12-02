# Encapsulation Activity: SecureAccount Class

## Objective

Practice implementing **encapsulation**, **access control**, and **data protection** through private fields and controlled access methods.

---

## Activity Description

Create a class named **`SecureAccount`** that demonstrates how encapsulation protects sensitive data. The class must use private variables, provide getters and setters with restrictions, and require a passkey to access or modify certain properties.

---

## Requirements

### 1. Private Instance Variables

All fields must be **private**:

* `accountNumber` (String)
* `ownerName` (String)
* `balance` (double)
* `passkey` (String) — **never returned or printed**

---

### 2. Constructor

The constructor should initialize:

* `accountNumber`
* `ownerName`
* `balance`
* `passkey`

---

### 3. Methods Requiring Passkey

#### `getAccountNumber(String key)`

* Return the account number **only if** `key` matches `passkey`.
* Otherwise return: `"INVALID PASSKEY"`.

#### `setOwnerName(String key, String newName)`

* Update `ownerName` **only if**:

  * `key` matches passkey
  * `newName` is not empty
* Otherwise perform no update.

#### `changePasskey(String oldKey, String newKey)`

* If `oldKey` is correct, update to `newKey`.
* Else return: `"INVALID PASSKEY"`.

---

### 4. Normal Methods (No Passkey Required)

#### `deposit(double amount)`

* Reject negative deposits.

#### `withdraw(double amount)`

* Reject withdrawals larger than balance.

#### `getBalance()`

* Return the balance.

---

## Starter Code (Optional)

```java
public class SecureAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String passkey;

    // TODO: Constructor

    // TODO: getAccountNumber(String key)

    // TODO: setOwnerName(String key, String newName)

    // TODO: changePasskey(String oldKey, String newKey)

    // TODO: deposit(double amount)

    // TODO: withdraw(double amount)

    // TODO: getBalance()
}
```

---

## Test Program Requirements

Write a main program that:

1. Creates a `SecureAccount` object.
2. Tries to access the account number using a wrong key.
3. Tries again using the correct key.
4. Attempts to change the owner name with wrong and correct keys.
5. Changes the passkey successfully.
6. Verifies that the old passkey no longer works.
7. Performs deposit and withdrawal.

---

## End of Activity
