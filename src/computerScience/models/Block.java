package computerScience.models;

import java.time.LocalDateTime;

public class Block {
    private int block_id;
    private String block_name;
    private String block_code;
    private LocalDateTime date_created;

    public Block() {
    }

    public Block(int block_id, String block_name, String block_code, LocalDateTime date_created) {
        this.block_id = block_id;
        this.block_name = block_name;
        this.block_code = block_code;
        this.date_created = date_created;
    }

    public int getBlock_id() {
        return block_id;
    }

    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getBlock_code() {
        return block_code;
    }

    public void setBlock_code(String block_code) {
        this.block_code = block_code;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Block{" +
                "block_id=" + block_id +
                ", block_name='" + block_name + '\'' +
                ", block_code='" + block_code + '\'' +
                ", date_created=" + date_created +
                '}';
    }
}
