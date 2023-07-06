import java.util.List;

import practicePrincy.AlbumsNotFoundException;

public interface ListDemoInterface {
    List<Album> searchAlbums(List<Album> albumList, int priceUpperLimit) throws AlbumsNotFoundException;
}
