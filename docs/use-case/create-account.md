## Use Case - Create Account
### Trigger
- User selects "Create Account" from the menu

### Goal
- User wants a new bank account they can use for deposits, withdrawals transfers

### Primary Flow

1. Sytem asks the user for account details (name, starting balance).
2. User enters the details.
3. System validates the input
4. System generates a unique account ID.
5. System creates the account object
6. System stores the account in the system's account list
7. system confirms the account was created.

### System Responsibilites
- Reject invalid input (negative balance, empty name)
- Ensure account ID's are unique
- Store the account reliably in memory
- Provide clear feedback to the user

### Alternate Flows
- User enters invalid data
    - System shows error
    - ask again
- User cancels
    - System returns to main menu