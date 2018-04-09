
import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug()
	{
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		selectedMedienTextArea.setText("");
		if (medien != null)
		{
			for (Medium medium : medien)
			{
				if (medium instanceof CD)
				{
					CD cd = (CD) medium;
					selectedMedienTextArea.setText(cd.getTitel());

				} else if (medium instanceof DVD)
				{
					DVD dvd = (DVD) medium;
					selectedMedienTextArea.setText(dvd.getTitel());
				} else
				{
					Videospiel vs = (Videospiel) medium;
					selectedMedienTextArea.setText(vs.getTitel());
				}
			}
		}
	}

	// public void setMedien(List<Medium> medien)
	// {
	// assert medien != null : "Vorbedingung verletzt: (medien != null)";
	// TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
	// selectedMedienTextArea.setText("");
	// for (Medium medium : medien)
	// {
	// selectedMedienTextArea.setText(medium.getFormatiertenString());
	// }
	// }

	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public Pane getUIPane()
	{
		return _ui.getUIPane();
	}
}
