/**
 * Ein Videospiel ist ein Medium. Zusätzlich zu den Eigenschaften eines Mediums
 * erfasst sie Informationen zu Spielsystem.
 * 
 * @author Thu Thao Tran, Paulina Pansow
 * @version SoSe 2018
 */
class Videospiel implements Medium
{
	/**
	 * Der Titel des Videospiels
	 */

	private String _titel;

	/**
	 * Der Kommentar des Videospiels
	 */
	private String _kommentar;

	/**
	 * Das System worauf das Videospiel lauffähig ist
	 */
	private String _system;
	
	/**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel des Videospiels
     * @param kommentar Ein Kommentar zu dem Videospiel
     * @param system Das System worauf das Videospiel lauffähig ist
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
      */
	public Videospiel(String titel, String kommentar, String system)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert system != null : "Vorbedingung verletzt: system != null";
		
		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	}

	
	@Override
	public String getKommentar()
	{
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	@Override
	public String getTitel()
	{
		return _titel;
	}

	public String getSystem()
	{
		return _system;
	}
	
	@Override
    public String getFormatiertenString()
    {
    	return "Titel: " + _titel + "\n" + "System: " + _system + "\n" + "Kommentar: " + _kommentar;
    }
}
