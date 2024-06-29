import java.util.Scanner;

public class PasswordStrengthChecker 
{

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine();

        
        int strength = checkPasswordStrength(password);

        
        switch (strength)
 {
            case 1:
                System.out.println("Password strength: Very Weak (must be at least 6 characters)");
                break;
            case 2:
                System.out.println("Password strength: Weak (lacks uppercase letters)");
                break;
            case 3:
                System.out.println("Password strength: Moderate (lacks numbers)");
                break;
            case 4:
                System.out.println("Password strength: Strong");
                break;
            case 5:
                System.out.println("Password strength: Very Strong");
                break;
            default:
                System.out.println("Invalid password strength check.");
                break;
        }

        scanner.close();
    }

    public static int checkPasswordStrength(String password) {
       
        boolean hasLength = password.length() >= 6;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        
        for (char ch : password.toCharArray())
 {
            if (Character.isUpperCase(ch)) 
{
                hasUppercase = true;
            } 
else if (Character.isLowerCase(ch))
 {
                hasLowercase = true;
            } 
else if (Character.isDigit(ch))
 {
                hasDigit = true;
            } 
else
 {
                hasSpecialChar = true;
            }
        }

        
        if (!hasLength)
 {
            return 1; // Very Weak
        } else if (!hasUppercase) 
{
            return 2; // Weak
        } else if (!hasDigit) 
{
            return 3; 
        }
 else if (!hasSpecialChar)
 {
            return 4; 
        } else 
{
            return 5; 
        }
    }
}
