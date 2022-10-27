package kodlama.io.rentaCar.business.concretes;

import java.util.List;

import kodlama.io.rentaCar.business.abstracts.ProgramLanguageService;
import kodlama.io.rentaCar.dataAccess.abstracts.ProgramLanguageRepository;
import kodlama.io.rentaCar.entities.ProgramLanguage;

public class ProgramLanguageManager implements ProgramLanguageService {

	private ProgramLanguageRepository repository;
	
	public ProgramLanguageManager(ProgramLanguageRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<ProgramLanguage> getAll() {
		return repository.getAll();
	}

	@Override
	public ProgramLanguage getOneLanguage(int id) {
		return repository.getOneLanguage(id);
	}

	@Override
	public ProgramLanguage add(ProgramLanguage language) {
		List<ProgramLanguage> languages = repository.getAll();
		long number =languages.stream().filter(lang->lang.getName()==language.getName()).count();
		if(number >0) {
			 System.out.println("bu isimde bir dil mevcut");
			return null;
		}
		else return repository.add(language);
	}

	@Override
	public ProgramLanguage update(ProgramLanguage language, int id) {
		return repository.update(language, id);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
		
	}

}
