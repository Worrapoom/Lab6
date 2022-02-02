package lab6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

 

public class Stack {

 

    protected Shell fm2;
    public int Answer ;
    private Text newValue_txt;

 

    /**
     * Launch the application.
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            form2 window = new form2();
//            window.open();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

 

    /**
     * Open the window.
     */
    public void open() {
        Display display = Display.getDefault();
        createContents();
        
        fm2.open();
        fm2.layout();
        while (!fm2.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

 

    /**
     * Create contents of the window.
     * @wbp.parser.entryPoint
     */
    protected void createContents() {
        fm2 = new Shell();
        fm2.setSize(450, 300);
        fm2.setText("This is Form2 naja");
        
        Label txt2 = new Label(fm2, SWT.NONE);
        txt2.setBounds(77, 52, 205, 20);
        txt2.setText("This is a book : " + this.getAnswer() );
        
        Button btn2 = new Button(fm2, SWT.NONE);
        btn2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                form1 window1 = new form1() ;
                System.out.println( "--> Answer (BEFORE BACK) = " + Answer );
                window1.setI( Answer ) ;
                System.out.println( "--> Current i = " + window1.getI() ) ;
                fm2.close();
            }//method
        });
        btn2.setBounds(118, 194, 205, 30);
        btn2.setText("Back to Form 1");
        
        Button btn_submit_f2 = new Button(fm2, SWT.NONE);
        btn_submit_f2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Answer = Integer.parseInt( newValue_txt.getText() ) ;
//                System.out.println( "--> Answer = " + Answer );
            }//end method
        });
        btn_submit_f2.setBounds(288, 95, 90, 30);
        btn_submit_f2.setText("Submit");
        
        newValue_txt = new Text(fm2, SWT.BORDER);
        newValue_txt.setText("" + this.getAnswer() );
        newValue_txt.setBounds(77, 97, 205, 26);

 

    }//end method

 

    public void setAnswer( int Answer ) {
        this.Answer = Answer ;
    }//end method
    
    public int getAnswer() {
        return this.Answer ;
    }//end method
    
}//end class
