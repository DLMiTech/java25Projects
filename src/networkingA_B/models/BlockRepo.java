package networkingA_B.models;

import networkingA_B.classes.Block;
import networkingA_B.db.DBAccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BlockRepo {
    private static final DBAccess dbAccess = new DBAccess();
    //add new block
    public static int insertBlock(Block block){
        int result = 0;
        try {
            String query = "insert into block(block_name, block_code) values (?, ?);";
            PreparedStatement ps = dbAccess.getConnection().prepareStatement(query);
            ps.setString(1, block.getBlock_name());
            ps.setString(2, block.getBlock_code());

            result = ps.executeUpdate();
        }catch (Exception e){
            System.out.println("Error inserting block: "+e.getMessage());
        }
        return result;
    }

    //get all blocks
    public  static List<Block> getAllBlocks(){
        List<Block> blockList = new ArrayList<>();
        Block block = null;
        try {
            String query = "select * from block;";
            PreparedStatement ps = dbAccess.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    block = new Block();
                    block.setBlock_id(rs.getInt("block_id"));
                    block.setBlock_name(rs.getString("block_name"));
                    block.setBlock_code(rs.getString("block_code"));
                    block.setDate_created(rs.getTimestamp("date_created").toLocalDateTime());

                    blockList.add(block);
                }
            }
        } catch (Exception e) {
            System.out.println("Error getting blocks: "+e.getMessage());
        }
        return blockList;
    }

    //get one block by id
    public static Block getOneBlock(int block_id){
        Block block = null;
        try {
            String query = "select * from block where block_id = ?;";
            PreparedStatement ps = dbAccess.getConnection().prepareStatement(query);
            ps.setInt(1, block_id);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    block = new Block();
                    block.setBlock_id(rs.getInt("block_id"));
                    block.setBlock_name(rs.getString("block_name"));
                    block.setBlock_code(rs.getString("block_code"));
                    block.setDate_created(rs.getTimestamp("date_created").toLocalDateTime());
                }
                return block;
            }

        } catch (Exception e) {
            System.out.println("Error getting block: "+e.getMessage());
        }
        return null;
    }

    //update the block
    public static boolean updateBlock(Block block){
        boolean result = false;
        try {
            String query = "update block set block_name = ?, block_code = ? where block_id = ?;";
            PreparedStatement ps = dbAccess.getConnection().prepareStatement(query);
            ps.setString(1, block.getBlock_name());
            ps.setString(2, block.getBlock_code());
            ps.setInt(3, block.getBlock_id());
            result = ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error updating block: "+e.getMessage());
        }
        return result;
    }

    //delete a block
    public static boolean deleteBlock(int block_id){
        boolean result = false;
        try {
            String query = "delete from block where block_id = ?;";
            PreparedStatement ps = dbAccess.getConnection().prepareStatement(query);
            ps.setInt(1, block_id);
            result = ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error deleting block: "+e.getMessage());
        }
        return result;
    }
}
