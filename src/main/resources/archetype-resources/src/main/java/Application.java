#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Application extends ApplicationWindow {

	public Application(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Point getInitialSize() {
		return new Point(640, 480);
	}

	protected Control createContents(Composite parent) {
		getShell().setText("Widget Window");
		return parent;
	}

	public static void main(String[] args) {
		Application app = new Application(null);
		app.setBlockOnOpen(true);
		app.open();
		Display.getCurrent().dispose();
	}
}
