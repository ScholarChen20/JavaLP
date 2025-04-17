package BasicDataType.VariableType_;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class StaticVariable {
    public static final String APP_NAME = "MyApp";
    public static final String APP_VERSION = "1.0.0";
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";

    public static void main(String[] args) {
        System.out.println("Application name: " + StaticVariable.APP_NAME);
        System.out.println("Application version: " + StaticVariable.APP_VERSION);
        System.out.println("Database URL: " + StaticVariable.DATABASE_URL);
    }
}
