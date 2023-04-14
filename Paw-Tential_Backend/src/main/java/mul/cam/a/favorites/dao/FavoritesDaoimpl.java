package mul.cam.a.favorites.dao;

import mul.cam.a.favorites.dto.FavoritesDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavoritesDaoimpl implements FavoritesDao{

  @Autowired
  SqlSession session;
  @Override
  public List<FavoritesDto> favorites() {
    return session.selectList("Favorites.getAllFavorites");
  }
}
