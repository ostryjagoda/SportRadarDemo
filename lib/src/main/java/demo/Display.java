package demo;

public class Display implements IDisplay {

    private final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void set(String s) {
        clearConsole();
        System.out.print(s);
    }
}
