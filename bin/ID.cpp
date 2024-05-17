#include <iostream>
#include <string>

// Function to perform user verification
bool verifyUser(std::string role) {
    if (role == "employee") {
        // Ask for a 4-digit PIN from the employee
        std::string inputPin;
        std::cout << "Enter your 4-digit PIN: ";
        std::cin >> inputPin;

        // Check if the input PIN is exactly 4 digits
        if (inputPin.length() != 4) {
            std::cout << "Invalid PIN length. Please enter a 4-digit PIN." << std::endl;
            return false;
        }

        // Check if the input PIN consists of only digits
        for (char c : inputPin) {
            if (!isdigit(c)) {
                std::cout << "Invalid PIN format. Please enter a 4-digit PIN." << std::endl;
                return false;
            }
        }

        // PIN is valid for an employee
        return true;
    } else if (role == "guest") {
        // Guests don't need PIN verification
        return true;
    } else {
        // Invalid role
        std::cout << "Invalid role. Please specify 'employee' or 'guest'." << std::endl;
        return false;
    }
}

int main() {
    std::string userRole;
    std::cout << "Enter your role (employee or guest): ";
    std::cin >> userRole;

    if (verifyUser(userRole)) {
        std::cout << "User verified successfully!" << std::endl;
        // Add your code for further actions for verified users here
    } else {
        std::cout << "User verification failed." << std::endl;
    }

    return 0;
}
