package indiciumtech.caiorocha.northwind.pipeline;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionRowMapper implements RowMapper<Region> {

    @Override
    public Region mapRow(ResultSet resultSet, int i) throws SQLException {
        Region region = new Region();

        region.setId(resultSet.getInt("region_id"));
        region.setDescription(resultSet.getString("region_description"));

        return region;
    }
}
