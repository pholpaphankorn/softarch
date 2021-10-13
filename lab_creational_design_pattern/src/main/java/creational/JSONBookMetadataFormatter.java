package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject jsonBooks;
    private JSONArray jsonBookArray;
    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        jsonBooks =new JSONObject();
        jsonBookArray =new JSONArray();
        jsonBooks.put("Books", jsonBookArray);
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jsonBookTmp=new JSONObject();
        JSONArray jsonAuthorArrayTmp = new JSONArray();

        for (String author:b.getAuthors()
             ) {
            jsonAuthorArrayTmp.add(author);
        }
        jsonBookTmp.put(Book.Metadata.ISBN.value,b.getISBN());
        jsonBookTmp.put(Book.Metadata.AUTHORS.value,jsonAuthorArrayTmp);
        jsonBookTmp.put(Book.Metadata.TITLE.value,b.getTitle());
        jsonBookTmp.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        jsonBookArray.add(jsonBookTmp);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return jsonBooks.toJSONString()+'\n';
    }
}
