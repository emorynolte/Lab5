package pkgEnum;

public enum eGameDifficulty 
{
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficulty; 
	
	public static java.util.Map<Integer, eGameDifficulty> lookup = new java.util.HashMap<Integer, eGameDifficulty>();
	
	static 
	{
		for (eGameDifficulty g : eGameDifficulty.values())
		{
			lookup.put(g.getiDifficulty(), g);
		}
	}
	
	private eGameDifficulty(int iDifficulty)
	{
		this.iDifficulty = iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty)
	{
		eGameDifficulty egd = null;
		
		for (eGameDifficulty g : eGameDifficulty.values()) 
		{
			if (g.iDifficulty >= iDifficulty)
			{
				egd = g;
			}
			else
			{
				break;
			}
		}
		
		return egd;
	}
	
	public int getiDifficulty()
	{
		return iDifficulty;
	}
}