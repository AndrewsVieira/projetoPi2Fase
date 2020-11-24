package FE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DecideTypeQuestionPanel extends JPanel {

  private MainFrame frame;
  // private FormQuestionPanel[] formQuestionPanels = new FormQuestionPanel[2];

  public DecideTypeQuestionPanel(MainFrame mainFrame) {
    this.frame = mainFrame;
    setMinimumSize(new Dimension(1200, 800));
    init();
  }

  // public void setArrayFormQuestionPanel() {
  //   this.formQuestionPanels = mainFrame.getFormQuestionPanels();
  // }

  private void init() {

    setLayout(new BorderLayout());

    JPanel panel;
    JPanel panelbt;
    JButton btnCreaterQuestions;
    JButton btnReadQuestions;

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(200, 150));
    add(panel, BorderLayout.NORTH);

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(200, 150));
    add(panel, BorderLayout.SOUTH);

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(350, 100));
    panel.setLayout(new FlowLayout());

    add(panel, BorderLayout.WEST);
    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(250, 100));
    panel.setLayout(new FlowLayout());
    add(panel, BorderLayout.EAST);

    panelbt = new JPanel();
    panel.setPreferredSize(new Dimension(350, 40));
    panelbt.setLayout(new GridLayout(4, 1, 5, 10));
    panelbt.setBackground(new Color(0, 238, 224));

    btnCreaterQuestions = new JButton("Questão discursiva");
    btnCreaterQuestions.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        // FormQuestionPanel form = new FormDicursiveQuestionPanel(mainFrame);
        // FormQuestionPanel[] forms = mainFrame.getFormQuestionPanels();
        frame.showForm(null, MainFrame.INDEX_DISCURSIVE);
      }
    });
    btnCreaterQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnCreaterQuestions.setForeground(new Color(5, 255, 90));
    btnCreaterQuestions.setRolloverEnabled(false);
    panelbt.add(btnCreaterQuestions);

    btnReadQuestions = new JButton("Questão objetiva");
    btnReadQuestions.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Questão objetiva")) {
          // FormQuestionPanel form = new FormObjectiveQuestionPanel(mainFrame);
          // FormQuestionPanel[] forms = mainFrame.getFormQuestionPanels();
          frame.showForm(null, MainFrame.INDEX_OBJECTIVE);
        }
      }
    });
    btnReadQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnReadQuestions.setForeground(new Color(5, 255, 90));
    btnReadQuestions.setBackground(Color.WHITE);
    btnReadQuestions.setRolloverEnabled(false);
    panelbt.add(btnReadQuestions);

    add(panelbt, BorderLayout.CENTER);

  }
}
