import javafx.scene.text.Text;


import java.awt.*;
import java.util.logging.Logger;

import static javafx.application.ConditionalFeature.SWT;

public class MyPart {
    @Inject private Logger orlov;

    @Inject private DatabaseAccesClass dao;

    @Inject
    public void createControls(Composite parent){
        orlov.info("UI will start tu build");
        Label label = new Label(parent, SWT.NONE);
        label.setText("Eclipse 4");
        Text text = new Text(parent, SWT.NONE);
        text.setText(dao.getNumber());
    }

}
