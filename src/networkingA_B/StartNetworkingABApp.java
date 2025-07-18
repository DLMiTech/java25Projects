package networkingA_B;

import networkingA_B.classes.Block;
import networkingA_B.models.BlockRepo;

import java.util.List;
import java.util.Scanner;

public class StartNetworkingABApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        Block addBlock = new Block();
//        System.out.println("Enter block name");
//        addBlock.setBlock_name(input.nextLine());
//
//        System.out.println("Enter block code");
//        addBlock.setBlock_code(input.nextLine());
//
//        int result = BlockRepo.insertBlock(addBlock);
//        if (result == 1){
//            System.out.println("Block added successfully");
//        }else {
//            System.out.println("Error adding block");
//        }



//        List<Block> blockList = BlockRepo.getAllBlocks();
//
//        System.out.printf("%-5s %-20s %-15s %-20s%n", "ID", "NAME", "CODE", "DATE");
//        System.out.println("-----------------------------------------------------------");
//        for (Block block : blockList) {
//            System.out.printf("%-5s %-20s %-15s %-20s%n", block.getBlock_id(), block.getBlock_name(), block.getBlock_code(), block.getDate_created());
//        }


//        System.out.println("Enter block id to get block info: ");
//        int block_id = input.nextInt();
//        Block block = BlockRepo.getOneBlock(block_id);
//        if (block == null) {
//            System.out.println("Block with id "+block_id+" not found");
//            return;
//        }
//        System.out.printf("%-5s %-20s %-15s %-20s%n", "ID", "NAME", "CODE", "DATE");
//        System.out.printf("%-5s %-20s %-15s %-20s%n",
//                block.getBlock_id(),
//                block.getBlock_name(),
//                block.getBlock_code(),
//                block.getDate_created());



//        System.out.println("Enter block id to delete: ");
//        int block_id = input.nextInt();
//        System.out.println("Are you sure you want to delete block" + block_id+ "(Yes/No)");
//        String confirm = input.next();
//        if (confirm.equalsIgnoreCase("Yes")){
//            boolean result = BlockRepo.deleteBlock(block_id);
//            if (result) {
//                System.out.println("Block deleted successfully");
//            }else {
//                System.out.println("Error deleting block");
//            }
//        }else {
//            System.out.println("Deleting can");
//        }


//        Block updateBlock = new Block();
//        System.out.println("Enter block id to update");
//        updateBlock.setBlock_id(input.nextInt());
//        System.out.println("Enter new block name");
//        updateBlock.setBlock_name(input.next());
//        System.out.println("Enter new block code");
//        updateBlock.setBlock_code(input.next());
//
//        boolean result = BlockRepo.updateBlock(updateBlock);
//        if (result) {
//            System.out.println("Block updated");
//        }else {
//            System.out.println("Error updating block");
//        }
//
    }
}
