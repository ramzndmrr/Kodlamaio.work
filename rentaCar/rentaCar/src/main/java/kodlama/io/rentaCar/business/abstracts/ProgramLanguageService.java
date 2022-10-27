package kodlama.io.rentaCar.business.abstracts;

import java.util.List;

import kodlama.io.rentaCar.entities.ProgramLanguage;

public interface ProgramLanguageService {
	public List<ProgramLanguage> getAll();
	public ProgramLanguage getOneLanguage(int id);
	public ProgramLanguage add(ProgramLanguage language);
	public ProgramLanguage update(ProgramLanguage language, int id);
	public void delete(int id);

}
