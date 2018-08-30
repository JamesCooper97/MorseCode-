
public enum Letter {
	A(".-"), B("-..."), C("-.-."), D("-.."), E("."), F("..-."), G("--."),
	H("...."), I(".."), J(".---"), K("-.-"), L(".-.."), M("--"), N("-."),
	O("---"), P(".--."), Q("--.-"), R(".-."), S("..."), T("-"), U("..-"),
	V("...-"), W(".--"), X("-..-"), Y("-.--"), Z("--..");
	
	private String morseLetter;
	
	private Letter(String morseLetter) {
		this.morseLetter = morseLetter;
	}
	
	public String getMorseLetter() {
		return morseLetter;
	}
}
