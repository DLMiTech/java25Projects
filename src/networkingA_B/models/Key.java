package networkingA_B.models;

import java.time.LocalDateTime;

public class Key {
    private int key_id;
    private int block_id;
    private String room_number;
    private int number_of_keys;
    private LocalDateTime date_created;

    public Key() {
    }

    public Key(int key_id, int block_id, String room_number, int number_of_keys, LocalDateTime date_created) {
        this.key_id = key_id;
        this.block_id = block_id;
        this.room_number = room_number;
        this.number_of_keys = number_of_keys;
        this.date_created = date_created;
    }

    public int getKey_id() {
        return key_id;
    }

    public void setKey_id(int key_id) {
        this.key_id = key_id;
    }

    public int getBlock_id() {
        return block_id;
    }

    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public int getNumber_of_keys() {
        return number_of_keys;
    }

    public void setNumber_of_keys(int number_of_keys) {
        this.number_of_keys = number_of_keys;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Key{" +
                "key_id=" + key_id +
                ", block_id=" + block_id +
                ", room_number='" + room_number + '\'' +
                ", number_of_keys=" + number_of_keys +
                ", date_created=" + date_created +
                '}';
    }
}
