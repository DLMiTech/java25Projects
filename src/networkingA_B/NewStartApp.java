package networkingA_B;

import networkingA_B.classes.Block;
import networkingA_B.models.BlockRepo;

import java.util.List;
import java.util.Scanner;

public class NewStartApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n==== MAIN MENU ====");
            System.out.println("1. Block");
            System.out.println("2. Keys");
            System.out.println("3. Users");
            System.out.println("0. Exit");
            System.out.println("Select an option: ");
            int mainChoice = input.nextInt();
            input.nextLine();


            switch (mainChoice) {
                case 1:
                    boolean blockMenu = true;
                    while (blockMenu) {
                        System.out.println("\n==== BLOCK MENU ====");
                        System.out.println("1. Add Block");
                        System.out.println("2. Update Block");
                        System.out.println("3. Delete Block");
                        System.out.println("4. Get One Block");
                        System.out.println("5. Get ALl Blocks");
                        System.out.println("0. Back to main menu");
                        System.out.println("Select an option: ");
                        int blockChoice = input.nextInt();
                        input.nextLine();
                        switch (blockChoice) {
                            case 1:
                                addBlock();
                                break;
                            case 2:
                                updateBlock();
                                break;
                            case 3:
                                deleteBlock();
                                break;
                            case 4:
                                getOneBlock();
                                break;
                            case 5:
                                getAllBlocks();
                                break;
                            case 0:
                                blockMenu = false;
                                break;
                            default:
                                System.out.println("❌ Invalid option, Try again.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("🔑 Key menu not implemented yet.");
                    break;
                case 3:
                    System.out.println("😒 Users menu not implemented yet.");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid option, Try again.");
            }
        }
    }

    public static void addBlock() {
        Block addBlock = new Block();
        System.out.println("Enter block name");
        addBlock.setBlock_name(input.nextLine());

        System.out.println("Enter block code");
        addBlock.setBlock_code(input.nextLine());

        int result = BlockRepo.insertBlock(addBlock);
        if (result == 1){
            System.out.println("Block added successfully");
        }else {
            System.out.println("Error adding block");
        }
    }

    public static void updateBlock() {
        Block updateBlock = new Block();
        System.out.println("Enter block id to update");
        updateBlock.setBlock_id(input.nextInt());
        System.out.println("Enter new block name");
        updateBlock.setBlock_name(input.next());
        System.out.println("Enter new block code");
        updateBlock.setBlock_code(input.next());

        boolean result = BlockRepo.updateBlock(updateBlock);
        if (result) {
            System.out.println("Block updated");
        }else {
            System.out.println("Error updating block");
        }
    }

    public static void deleteBlock() {
        System.out.println("Enter block id to delete: ");
        int block_id = input.nextInt();
        System.out.println("Are you sure you want to delete block" + block_id+ "(Yes/No)");
        String confirm = input.next();
        if (confirm.equalsIgnoreCase("Yes")){
            boolean result = BlockRepo.deleteBlock(block_id);
            if (result) {
                System.out.println("Block deleted successfully");
            }else {
                System.out.println("Error deleting block");
            }
        }else {
            System.out.println("Deleting can");
        }
    }

    public static void getOneBlock() {
        System.out.println("Enter block id to get block info: ");
        int block_id = input.nextInt();
        Block block = BlockRepo.getOneBlock(block_id);
        if (block == null) {
            System.out.println("Block with id "+block_id+" not found");
            return;
        }
        System.out.printf("%-5s %-20s %-15s %-20s%n", "ID", "NAME", "CODE", "DATE");
        System.out.printf("%-5s %-20s %-15s %-20s%n",
                block.getBlock_id(),
                block.getBlock_name(),
                block.getBlock_code(),
                block.getDate_created());
    }

    public static void getAllBlocks() {
        List<Block> blockList = BlockRepo.getAllBlocks();

        System.out.printf("%-5s %-20s %-15s %-20s%n", "ID", "NAME", "CODE", "DATE");
        System.out.println("-----------------------------------------------------------");
        for (Block block : blockList) {
            System.out.printf("%-5s %-20s %-15s %-20s%n", block.getBlock_id(), block.getBlock_name(), block.getBlock_code(), block.getDate_created());
        }
    }
}
