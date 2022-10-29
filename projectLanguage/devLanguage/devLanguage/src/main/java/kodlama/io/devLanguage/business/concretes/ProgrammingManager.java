package kodlama.io.devLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devLanguage.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devLanguage.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository pLanguagesRepository;
	
     @Autowired
	public ProgrammingManager(ProgrammingLanguageRepository pLanguagesRepository) {
		
		this.pLanguagesRepository = pLanguagesRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return pLanguagesRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getId(int id) throws Exception {
		
		return this.pLanguagesRepository.getId(id);
	}

	@Override
	public void pLanguageAdd(ProgrammingLanguage pLanguage) throws Exception {
		
		if(pLangControl(pLanguage)) {
			throw new Exception("Boş ve Aynı Olamaz!");
		}
		this.pLanguagesRepository.pLanguageAdd(pLanguage);
		
	}
	public boolean pLangControl(ProgrammingLanguage pLanguage) {
		List<ProgrammingLanguage> pLanguages=pLanguagesRepository.getAll();
		for (ProgrammingLanguage programmingLanguage : pLanguages) {
			if(programmingLanguage.getName().equalsIgnoreCase(pLanguage.getName()) 
			|| pLanguage.getName().equals("")
			|| programmingLanguage.getId()==(pLanguage.getId())){
				return true;
			}
			
		}
		return false;
		}

	@Override
	public void pLanguageUpdate(ProgrammingLanguage pLanguage) {
		this.pLanguagesRepository.pLanguageUpdate(pLanguage);
		
	}

	@Override
	public void pLanguageDelete(int id) {
		this.pLanguagesRepository.pLanguageDelete(id);
		
	}
	
	

}
