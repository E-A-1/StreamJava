import java.util.ArrayList;
import java.util.List;

import practicePrincy.AlbumsNotFoundException;

public class ListDemoMain {

    public static void main(String[] args) throws AlbumsNotFoundException {

        Album firstAlbum = new Album("wedding", "harris", 500, "13223");
        Album secondAlbum = new Album("birthday", "zaik", 250, "13223");
        Album thirdAlbum = new Album("post-wedding", "bts", 100, "13223");

        List<Album> albumsList = new ArrayList<>();
        albumsList.add(firstAlbum);
        albumsList.add(secondAlbum);
        albumsList.add(thirdAlbum);
        ListDemo listDemo = new ListDemo();
        List<Album> retrievedAlbumList = listDemo.searchAlbums(albumsList, 300);

        System.out.println("Number of albums retrieved with in the price limit is " + retrievedAlbumList.size());

    }
}
