package ssf.day14workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssf.day14workshop.model.Contact;
import ssf.day14workshop.repositories.AddressbookRepository;

@Service
public class AddressbookService {
    @Autowired
    private AddressbookRepository addrbookRepo;

    public void saveContact(final Contact ctc){
        addrbookRepo.save(ctc);
    }

    public Contact findContactById(String contactId){
        return addrbookRepo.findById(contactId);
    }

    public List<Contact> getAllContact(int startIndex){
        return addrbookRepo.findAll(startIndex);
    }
}