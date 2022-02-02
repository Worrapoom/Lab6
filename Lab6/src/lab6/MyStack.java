package lab6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

 

public class MyStack {

 

    protected Shell fm1;
    private Text     txt1;
    public int         i ;

 

    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        try {
            form1 window = new form1();
            window.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 

    /**
     * Open the window.
     */
    public void open() {
        Display display = Display.getDefault();
        createContents();
        fm1.open();
        fm1.layout();
        while (!fm1.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

 

    
//    Fibonacci Series
//    1 1 2 3 5 8 13 21 ...
//    #1 fibo(n) = fibo(n-1) + fibo(n-2)
//    #2 fibo(1) = 1
    
    public int fibo( int n ) {
        if( n > 1 ) return fibo( n-1 ) + fibo( n-2 ) ;
        else         return 1 ;
    }//end method
    
//    5! = 5 x 4!
//    4! = 4 x 3!
//    3! = 3 x 2!
//    2! = 2 x 1!
//    1! = 1
//    
//    n! = n x (n-1)!
//    1! = 1
    
    public int fac( int n ) {
        if( n > 1 ) return n + fac( n-1 ) ;
        else         return 1 ;
    }//end method
    
    /**
     * Create contents of the window.
     */
    protected void createContents() {
        fm1 = new Shell();
        fm1.setSize(450, 300);
        fm1.setText("This is Form 1");
        
        for( int j = 0 ; j < 10 ; j++ )
            System.out.println( "" + this.fibo( j ) ) ;
        
        
        
        txt1 = new Text(fm1, SWT.BORDER | SWT.MULTI);
        txt1.setText("\u0E17\u0E14\u0E2A\u0E2D\u0E1A");
        txt1.setBounds(10, 10, 412, 99);
        
        Button btn1 = new Button(fm1, SWT.NONE);
        btn1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                
                txt1.setText( "Hello World : " + i );
                
                btn1.setEnabled(false);
                
                form2 window2 = new form2() ;
                
//                window2.Answer = 99 ;
                window2.setAnswer( 99 ) ;
                window2.open();
                
                i = window2.getAnswer() ;
                System.out.println( "new i = " + i ) ;
                
                btn1.setEnabled(true);
                
                txt1.setText( "Answer : " + i );
                
            }//end method
        });
        btn1.setBounds(92, 141, 254, 72);
        btn1.setText("Submit");

 

    }//end method
    
    public void setI( int i ) {
        this.i = i ;
    }//end method
    
    public int getI() {
        return this.i ;
    }//end method
}//end class
