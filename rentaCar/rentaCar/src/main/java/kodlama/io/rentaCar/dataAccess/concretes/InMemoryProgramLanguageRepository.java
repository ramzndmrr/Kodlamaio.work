package kodlama.io.rentaCar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import kodlama.io.rentaCar.dataAccess.abstracts.ProgramLanguageRepository;
import kodlama.io.rentaCar.entities.ProgramLanguage;

public class InMemoryProgramLanguageRepository implements ProgramLanguageRepository {

	List<ProgramLanguage> languages = new ArrayList<ProgramLanguage>();
	
	@Override
	public List<ProgramLanguage> getAll() {
		return languages;
	}
	

	@Override
	public ProgramLanguage getOneLanguage(int id) {
		Optional<ProgramLanguage> language= languages.stream().filter(la->la.getId()==id).findFirst();
		return language.get();
		
	
	}

	@Override
	public ProgramLanguage add(ProgramLanguage programLanguage) {
		ProgramLanguage language = new ProgramLanguage(programLanguage.getId(),programLanguage.getName());
		languages.add(language);
		return language;
	}

	@Override
	public ProgramLanguage update(ProgramLanguage programLanguage, int id) {
		Optional<ProgramLanguage> language = languages.stream().filter(la->la.getId()==id).findFirst();
		ProgramLanguage lang = language.get();
		lang.setId(programLanguage.getId());
		lang.setName(programLanguage.getName());
		return lang;
	}

	@Override
	public void delete(int id) {
		Optional<ProgramLanguage> language = languages.stream().filter(la->la.getId()==id).findFirst();
		languages.remove(language); 
		
	}

}
