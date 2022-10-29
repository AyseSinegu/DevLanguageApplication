package kodlama.io.devLanguage.business.abstracts;

import java.util.List;

import kodlama.io.devLanguage.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getId(int id) throws Exception;
	void pLanguageAdd(ProgrammingLanguage pLanguage) throws Exception;
	void pLanguageUpdate(ProgrammingLanguage pLanguage);
	void pLanguageDelete(int id);

}
