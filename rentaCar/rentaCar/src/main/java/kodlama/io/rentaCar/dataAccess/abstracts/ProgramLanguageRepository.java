package kodlama.io.rentaCar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentaCar.entities.ProgramLanguage;

public interface ProgramLanguageRepository {

	public List<ProgramLanguage> getAll();
	public ProgramLanguage getOneLanguage(int id);
	public ProgramLanguage add(ProgramLanguage programLanguage);
	public ProgramLanguage update(ProgramLanguage programLanguage,int id);
	void delete (int id);
}
