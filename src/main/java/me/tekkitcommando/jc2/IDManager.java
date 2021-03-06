package me.tekkitcommando.jc2;

import java.util.HashMap;

public class IDManager {

    /**
     * @author Phillip
     * @author Ethan
     */
    public HashMap blockInfo;

    public IDManager() {
        this.blockInfo = new HashMap();
        blockInfo.put("wood", "5");
        blockInfo.put("air", "0");
        blockInfo.put("stone", "1");
        blockInfo.put("granite", "1:1");
        blockInfo.put("polished_granite", "1:2");
        blockInfo.put("diorite", "1:3");
        blockInfo.put("polished_diorite", "1:4");
        blockInfo.put("andesite", "1:5");
        blockInfo.put("polished_andesite", "1:6");
        blockInfo.put("grass", "2");
        blockInfo.put("dirt", "3");
        blockInfo.put("coarse_dirt", "3:1");
        blockInfo.put("podzol", "3:2");
        blockInfo.put("cobblestone", "4");
        blockInfo.put("spruce", "5:1");
        blockInfo.put("birch", "5:2");
        blockInfo.put("jungle", "5:3");
        blockInfo.put("acacia", "5:4");
        blockInfo.put("dark_oak", "5:5");
        blockInfo.put("oak_sapling", "6");
        blockInfo.put("spruce_sapling", "6:1");
        blockInfo.put("birch_sapling", "6:2");
        blockInfo.put("jungle_sapling", "6:3");
        blockInfo.put("acacia_sapling", "6:4");
        blockInfo.put("dark_oak_sapling", "6:5");
        blockInfo.put("bedrock", "7");
        blockInfo.put("flowing_water", "8");
        blockInfo.put("still_water", "9");
        blockInfo.put("flowing_lava", "10");
        blockInfo.put("still_lava", "11");
        blockInfo.put("sand", "12");
        blockInfo.put("red_sand", "12:1");
        blockInfo.put("gravel", "13");
        blockInfo.put("gold_ore", "14");
        blockInfo.put("iron_ore", "15");
        blockInfo.put("coal_ore", "16");
        blockInfo.put("oak_wood", "17");
        blockInfo.put("spruce_wood", "17:1");
        blockInfo.put("birch_wood", "17:2");
        blockInfo.put("jungle_wood", "17:3");
        blockInfo.put("oak_leaves", "18");
        blockInfo.put("spruce_leaves", "18:1");
        blockInfo.put("birch_leaves", "18:2");
        blockInfo.put("jungle_leaves", "18:3");
        blockInfo.put("sponge", "19");
        blockInfo.put("wet_sponge", "19:1");
        blockInfo.put("glass", "20");
        blockInfo.put("lapis_ore", "21");
        blockInfo.put("lapis_block", "22");
        blockInfo.put("dispenser", "23");
        blockInfo.put("sandstone", "24");
        blockInfo.put("chiseled_sandstone", "24:01");
        blockInfo.put("smooth_sandstone", "24:02");
        blockInfo.put("note_block", "25");
        blockInfo.put("bed", "26");
        blockInfo.put("powered_rail", "27");
        blockInfo.put("detector_rail", "28");
        blockInfo.put("sticky_piston", "29");
        blockInfo.put("cobweb", "30");
        blockInfo.put("dead_shrub", "31");
        blockInfo.put("grass", "31:01");
        blockInfo.put("fern", "31:02");
        blockInfo.put("dead_shrub", "32");
        blockInfo.put("piston", "33");
        blockInfo.put("piston_head", "34");
        blockInfo.put("white_wool", "35");
        blockInfo.put("orange_wool", "35:01");
        blockInfo.put("magenta_wool", "35:02");
        blockInfo.put("light_blue_wool", "35:03");
        blockInfo.put("yellow_wool", "35:04");
        blockInfo.put("lime_wool", "35:05");
        blockInfo.put("pink_wool", "35:06");
        blockInfo.put("gray_wool", "35:07");
        blockInfo.put("light_gray_wool", "35:08");
        blockInfo.put("cyan_wool", "35:09");
        blockInfo.put("purple_wool", "35:10");
        blockInfo.put("blue_wool", "35:11");
        blockInfo.put("brown_wool", "35:12");
        blockInfo.put("green_wool", "35:13");
        blockInfo.put("red_wool", "35:14");
        blockInfo.put("black_wool", "35:15");
        blockInfo.put("dandelion", "37");
        blockInfo.put("poppy", "38");
        blockInfo.put("blue_orchid", "38:01");
        blockInfo.put("allium", "38:02");
        blockInfo.put("azure_bluet", "38:03");
        blockInfo.put("red_tulip", "38:04");
        blockInfo.put("orange_tulip", "38:05");
        blockInfo.put("white_tulip", "38:06");
        blockInfo.put("pink_tulip", "38:07");
        blockInfo.put("oxeye_daisy", "38:08");
        blockInfo.put("brown_mushroom", "39");
        blockInfo.put("red_mushroom", "40");
        blockInfo.put("gold_block", "41");
        blockInfo.put("iron_block", "42");
        blockInfo.put("double_stone_slab", "43");
        blockInfo.put("double_sandstone_slab", "43:01");
        blockInfo.put("double_wooden_slab", "43:02");
        blockInfo.put("double_cobblestone_slab", "43:03");
        blockInfo.put("double_brick_slab", "43:04");
        blockInfo.put("double_stone_brick_slab", "43:05");
        blockInfo.put("double_nether_brick_slab", "43:06");
        blockInfo.put("double_quartz_slab", "43:07");
        blockInfo.put("stone_slab", "44");
        blockInfo.put("sandstone_slab", "44:01");
        blockInfo.put("wooden_slab", "44:02");
        blockInfo.put("cobblestone_slab", "44:03");
        blockInfo.put("brick_slab", "44:04");
        blockInfo.put("stone_brick_slab", "44:05");
        blockInfo.put("nether_brick_slab", "44:06");
        blockInfo.put("quartz_slab", "44:07");
        blockInfo.put("bricks", "45");
        blockInfo.put("tnt", "46");
        blockInfo.put("bookshelf", "47");
        blockInfo.put("moss_stone", "48");
        blockInfo.put("obsidian", "49");
        blockInfo.put("torch", "50");
        blockInfo.put("fire", "51");
        blockInfo.put("monster_spawner", "52");
        blockInfo.put("oak_wood_stairs", "53");
        blockInfo.put("chest", "54");
        blockInfo.put("redstone_wire", "55");
        blockInfo.put("diamond_ore", "56");
        blockInfo.put("diamond_block", "57");
        blockInfo.put("crafting_table", "58");
        blockInfo.put("wheat_crops", "59");
        blockInfo.put("farmland", "60");
        blockInfo.put("furnace", "61");
        blockInfo.put("burning_furnace", "62");
        blockInfo.put("standing_sign_block", "63");
        blockInfo.put("wooden_door_block", "64");
        blockInfo.put("ladder", "65");
        blockInfo.put("rail", "66");
        blockInfo.put("cobblestone_stairs", "67");
        blockInfo.put("wall_mounted_sign_block", "68");
        blockInfo.put("lever", "69");
        blockInfo.put("stone_pressure_plate", "70");
        blockInfo.put("iron_door_block", "71");
        blockInfo.put("wooden_pressure_plate", "72");
        blockInfo.put("redstone_ore", "73");
        blockInfo.put("glowing_redstone_ore", "74");
        blockInfo.put("redstone_torch_off", "75");
        blockInfo.put("redstone_torch_on", "76");
        blockInfo.put("stone_button", "77");
        blockInfo.put("snow", "78");
        blockInfo.put("ice", "79");
        blockInfo.put("snow_block", "80");
        blockInfo.put("cactus", "81");
        blockInfo.put("clay", "82");
        blockInfo.put("sugar_canes", "83");
        blockInfo.put("jukebox", "84");
        blockInfo.put("oak_fence", "85");
        blockInfo.put("pumpkin", "86");
        blockInfo.put("netherrack", "87");
        blockInfo.put("soul_sand", "88");
        blockInfo.put("glowstone", "89");
        blockInfo.put("nether_portal", "90");
        blockInfo.put("jack_o'lantern", "91");
        blockInfo.put("cake_block", "92");
        blockInfo.put("redstone_repeater_block_off", "93");
        blockInfo.put("redstone_repeater_block_on", "94");
        blockInfo.put("white_stained_glass", "95");
        blockInfo.put("orange_stained_glass", "95:01");
        blockInfo.put("magenta_stained_glass", "95:02");
        blockInfo.put("light_blue_stained_glass", "95:03");
        blockInfo.put("yellow_stained_glass", "95:04");
        blockInfo.put("lime_stained_glass", "95:05");
        blockInfo.put("pink_stained_glass", "95:06");
        blockInfo.put("gray_stained_glass", "95:07");
        blockInfo.put("light_gray_stained_glass", "95:08");
        blockInfo.put("cyan_stained_glass", "95:09");
        blockInfo.put("purple_stained_glass", "95:10");
        blockInfo.put("blue_stained_glass", "95:11");
        blockInfo.put("brown_stained_glass", "95:12");
        blockInfo.put("green_stained_glass", "95:13");
        blockInfo.put("red_stained_glass", "95:14");
        blockInfo.put("black_stained_glass", "95:15");
        blockInfo.put("wooden_trapdoor", "96");
        blockInfo.put("stone_monster_egg", "97");
        blockInfo.put("cobblestone_monster_egg", "97:01");
        blockInfo.put("stone_brick_monster_egg", "97:02");
        blockInfo.put("mossy_stone_brick_monster_egg", "97:03");
        blockInfo.put("cracked_stone_brick_monster_egg", "97:04");
        blockInfo.put("chiseled_stone_brick_monster_egg", "97:05");
        blockInfo.put("stone_bricks", "98");
        blockInfo.put("mossy_stone_bricks", "98:01");
        blockInfo.put("cracked_stone_bricks", "98:02");
        blockInfo.put("chiseled_stone_bricks", "98:03");
        blockInfo.put("red_mushroom_cap", "99");
        blockInfo.put("brown_mushroom_cap", "100");
        blockInfo.put("iron_bars", "101");
        blockInfo.put("glass_pane", "102");
        blockInfo.put("melon_block", "103");
        blockInfo.put("pumpkin_stem", "104");
        blockInfo.put("melon_stem", "105");
        blockInfo.put("vines", "106");
        blockInfo.put("oak_fence_gate", "107");
        blockInfo.put("brick_stairs", "108");
        blockInfo.put("stone_brick_stairs", "109");
        blockInfo.put("mycelium", "110");
        blockInfo.put("lily_pad", "111");
        blockInfo.put("nether_brick", "112");
        blockInfo.put("nether_brick_fence", "113");
        blockInfo.put("nether_brick_stairs", "114");
        blockInfo.put("nether_wart", "115");
        blockInfo.put("enchantment_table", "116");
        blockInfo.put("brewing_stand", "117");
        blockInfo.put("cauldron", "118");
        blockInfo.put("end_portal", "119");
        blockInfo.put("end_portal_frame", "120");
        blockInfo.put("end_stone", "121");
        blockInfo.put("dragon_egg", "122");
        blockInfo.put("redstone_lamp_inactive", "123");
        blockInfo.put("redstone_lamp_active", "124");
        blockInfo.put("double_oak_wood_slab", "125");
        blockInfo.put("double_spruce_wood_slab", "125:01");
        blockInfo.put("double_birch_wood_slab", "125:02");
        blockInfo.put("double_jungle_wood_slab", "125:03");
        blockInfo.put("double_acacia_wood_slab", "125:04");
        blockInfo.put("double_dark_oak_wood_slab", "125:05");
        blockInfo.put("oak_wood_slab", "126");
        blockInfo.put("spruce_wood_slab", "126:01");
        blockInfo.put("birch_wood_slab", "126:02");
        blockInfo.put("jungle_wood_slab", "126:03");
        blockInfo.put("acacia_wood_slab", "126:04");
        blockInfo.put("dark_oak_wood_slab", "126:05");
        blockInfo.put("cocoa", "127");
        blockInfo.put("sandstone_stairs", "128");
        blockInfo.put("emerald_ore", "129");
        blockInfo.put("ender_chest", "130");
        blockInfo.put("tripwire_hook", "131");
        blockInfo.put("tripwire", "132");
        blockInfo.put("emerald_block", "133");
        blockInfo.put("spruce_wood_stairs", "134");
        blockInfo.put("birch_wood_stairs", "135");
        blockInfo.put("jungle_wood_stairs", "136");
        blockInfo.put("command_block", "137");
        blockInfo.put("beacon", "138");
        blockInfo.put("cobblestone_wall", "139");
        blockInfo.put("mossy_cobblestone_wall", "139:01");
        blockInfo.put("flower_pot", "140");
        blockInfo.put("carrots", "141");
        blockInfo.put("potatoes", "142");
        blockInfo.put("wooden_button", "143");
        blockInfo.put("mob_head", "144");
        blockInfo.put("anvil", "145");
        blockInfo.put("trapped_chest", "146");
        blockInfo.put("weighted_pressure_plate_light", "147");
        blockInfo.put("weighted_pressure_plate_heavy", "148");
        blockInfo.put("redstone_comparator_inactive", "149");
        blockInfo.put("redstone_comparator_active", "150");
        blockInfo.put("daylight_sensor", "151");
        blockInfo.put("redstone_block", "152");
        blockInfo.put("nether_quartz_ore", "153");
        blockInfo.put("hopper", "154");
        blockInfo.put("quartz_block", "155");
        blockInfo.put("chiseled_quartz_block", "155:01");
        blockInfo.put("pillar_quartz_block", "155:02");
        blockInfo.put("quartz_stairs", "156");
        blockInfo.put("activator_rail", "157");
        blockInfo.put("dropper", "158");
        blockInfo.put("white_stained_clay", "159");
        blockInfo.put("orange_stained_clay", "159:01");
        blockInfo.put("magenta_stained_clay", "159:02");
        blockInfo.put("light_blue_stained_clay", "159:03");
        blockInfo.put("yellow_stained_clay", "159:04");
        blockInfo.put("lime_stained_clay", "159:05");
        blockInfo.put("pink_stained_clay", "159:06");
        blockInfo.put("gray_stained_clay", "159:07");
        blockInfo.put("light_gray_stained_clay", "159:08");
        blockInfo.put("cyan_stained_clay", "159:09");
        blockInfo.put("purple_stained_clay", "159:10");
        blockInfo.put("blue_stained_clay", "159:11");
        blockInfo.put("brown_stained_clay", "159:12");
        blockInfo.put("green_stained_clay", "159:13");
        blockInfo.put("red_stained_clay", "159:14");
        blockInfo.put("black_stained_clay", "159:15");
        blockInfo.put("white_stained_glass_pane", "160");
        blockInfo.put("orange_stained_glass_pane", "160:01");
        blockInfo.put("magenta_stained_glass_pane", "160:02");
        blockInfo.put("light_blue_stained_glass_pane", "160:03");
        blockInfo.put("yellow_stained_glass_pane", "160:04");
        blockInfo.put("lime_stained_glass_pane", "160:05");
        blockInfo.put("pink_stained_glass_pane", "160:06");
        blockInfo.put("gray_stained_glass_pane", "160:07");
        blockInfo.put("light_gray_stained_glass_pane", "160:08");
        blockInfo.put("cyan_stained_glass_pane", "160:09");
        blockInfo.put("purple_stained_glass_pane", "160:10");
        blockInfo.put("blue_stained_glass_pane", "160:11");
        blockInfo.put("brown_stained_glass_pane", "160:12");
        blockInfo.put("green_stained_glass_pane", "160:13");
        blockInfo.put("red_stained_glass_pane", "160:14");
        blockInfo.put("black_stained_glass_pane", "160:15");
        blockInfo.put("acacia_leaves", "161");
        blockInfo.put("dark_oak_leaves", "161:01");
        blockInfo.put("acacia_wood", "162");
        blockInfo.put("dark_oak_wood", "162:01");
        blockInfo.put("acacia_wood_stairs", "163");
        blockInfo.put("dark_oak_wood_stairs", "164");
        blockInfo.put("slime_block", "165");
        blockInfo.put("barrier", "166");
        blockInfo.put("iron_trapdoor", "167");
        blockInfo.put("prismarine", "168");
        blockInfo.put("prismarine_bricks", "168:01");
        blockInfo.put("dark_prismarine", "168:02");
        blockInfo.put("sea_lantern", "169");
        blockInfo.put("hay_bale", "170");
        blockInfo.put("white_carpet", "171");
        blockInfo.put("orange_carpet", "171:01");
        blockInfo.put("magenta_carpet", "171:02");
        blockInfo.put("light_blue_carpet", "171:03");
        blockInfo.put("yellow_carpet", "171:04");
        blockInfo.put("lime_carpet", "171:05");
        blockInfo.put("pink_carpet", "171:06");
        blockInfo.put("gray_carpet", "171:07");
        blockInfo.put("light_gray_carpet", "171:08");
        blockInfo.put("cyan_carpet", "171:09");
        blockInfo.put("purple_carpet", "171:10");
        blockInfo.put("blue_carpet", "171:11");
        blockInfo.put("brown_carpet", "171:12");
        blockInfo.put("green_carpet", "171:13");
        blockInfo.put("red_carpet", "171:14");
        blockInfo.put("black_carpet", "171:15");
        blockInfo.put("hardened_clay", "172");
        blockInfo.put("block_of_coal", "173");
        blockInfo.put("packed_ice", "174");
        blockInfo.put("sunflower", "175");
        blockInfo.put("lilac", "175:01");
        blockInfo.put("double_tallgrass", "175:02");
        blockInfo.put("large_fern", "175:03");
        blockInfo.put("rose_bush", "175:04");
        blockInfo.put("peony", "175:05");
        blockInfo.put("free_standing_banner", "176");
        blockInfo.put("wall_mounted_banner", "177");
        blockInfo.put("inverted_daylight_sensor", "178");
        blockInfo.put("red_sandstone", "179");
        blockInfo.put("smooth_red_sandstone", "179:01");
        blockInfo.put("chiseled_red_sandstone", "179:02");
        blockInfo.put("red_sandstone_stairs", "180");
        blockInfo.put("double_red_sandstone_slab", "181");
        blockInfo.put("red_sandstone_slab", "182");
        blockInfo.put("spruce_fence_gate", "183");
        blockInfo.put("birch_fence_gate", "184");
        blockInfo.put("jungle_fence_gate", "185");
        blockInfo.put("dark_oak_fence_gate", "186");
        blockInfo.put("acacia_fence_gate", "187");
        blockInfo.put("spruce_fence", "188");
        blockInfo.put("birch_fence", "189");
        blockInfo.put("jungle_fence", "190");
        blockInfo.put("dark_oak_fence", "191");
        blockInfo.put("acacia_fence", "192");
        blockInfo.put("spure_door_block", "193");
        blockInfo.put("birch_door_block", "194");
        blockInfo.put("jungle_door_block", "195");
        blockInfo.put("acacia_door_block", "196");
        blockInfo.put("dark_oak_door_block", "197");
        blockInfo.put("iron_shovel", "256");
        blockInfo.put("iron_pickaxe", "257");
        blockInfo.put("iron_axe", "258");
        blockInfo.put("flint_and_steel", "259");
        blockInfo.put("apple", "260");
        blockInfo.put("bow", "261");
        blockInfo.put("arrow", "262");
        blockInfo.put("coal", "263");
        blockInfo.put("charcoal", "263:01");
        blockInfo.put("diamond", "264");
        blockInfo.put("iron_ingot", "265");
        blockInfo.put("gold_ingot", "266");
        blockInfo.put("iron_sword", "267");
        blockInfo.put("wooden_sword", "268");
        blockInfo.put("wooden_shovel", "269");
        blockInfo.put("wooden_pickaxe", "270");
        blockInfo.put("wooden_axe", "271");
        blockInfo.put("stone_sword", "272");
        blockInfo.put("stone_shovel", "273");
        blockInfo.put("stone_pickaxe", "274");
        blockInfo.put("stone_axe", "275");
        blockInfo.put("diamond_sword", "276");
        blockInfo.put("diamond_shovel", "277");
        blockInfo.put("diamond_pickaxe", "278");
        blockInfo.put("diamond_axe", "279");
        blockInfo.put("stick", "280");
        blockInfo.put("bowl", "281");
        blockInfo.put("mushroom_stew", "282");
        blockInfo.put("golden_sword", "283");
        blockInfo.put("golden_shovel", "284");
        blockInfo.put("golden_pickaxe", "285");
        blockInfo.put("golden_axe", "286");
        blockInfo.put("string", "287");
        blockInfo.put("feather", "288");
        blockInfo.put("gunpowder", "289");
        blockInfo.put("wooden_hoe", "290");
        blockInfo.put("stone_hoe", "291");
        blockInfo.put("iron_hoe", "292");
        blockInfo.put("diamond_hoe", "293");
        blockInfo.put("golden_hoe", "294");
        blockInfo.put("wheat_seeds", "295");
        blockInfo.put("wheat", "296");
        blockInfo.put("bread", "297");
        blockInfo.put("leather_helmet", "298");
        blockInfo.put("leather_tunic", "299");
        blockInfo.put("leather_pants", "300");
        blockInfo.put("leather_boots", "301");
        blockInfo.put("chainmail_helmet", "302");
        blockInfo.put("chainmail_chestplate", "303");
        blockInfo.put("chainmail_leggings", "304");
        blockInfo.put("chainmail_boots", "305");
        blockInfo.put("iron_helmet", "306");
        blockInfo.put("iron_chestplate", "307");
        blockInfo.put("iron_leggings", "308");
        blockInfo.put("iron_boots", "309");
        blockInfo.put("diamond_helmet", "310");
        blockInfo.put("diamond_chestplate", "311");
        blockInfo.put("diamond_leggings", "312");
        blockInfo.put("diamond_boots", "313");
        blockInfo.put("golden_helmet", "314");
        blockInfo.put("golden_chestplate", "315");
        blockInfo.put("golden_leggings", "316");
        blockInfo.put("golden_boots", "317");
        blockInfo.put("flint", "318");
        blockInfo.put("raw_porkchop", "319");
        blockInfo.put("cooked_porkchop", "320");
        blockInfo.put("painting", "321");
        blockInfo.put("golden_apple", "322");
        blockInfo.put("enchanted_golden_apple", "322:01");
        blockInfo.put("sign", "323");
        blockInfo.put("wooden_door", "324");
        blockInfo.put("bucket", "325");
        blockInfo.put("water_bucket", "326");
        blockInfo.put("lava_bucket", "327");
        blockInfo.put("minecart", "328");
        blockInfo.put("saddle", "329");
        blockInfo.put("iron_door", "330");
        blockInfo.put("redstone", "331");
        blockInfo.put("snowball", "332");
        blockInfo.put("boat", "333");
        blockInfo.put("leather", "334");
        blockInfo.put("milk_bucket", "335");
        blockInfo.put("brick", "336");
        blockInfo.put("clay", "337");
        blockInfo.put("sugar_canes", "338");
        blockInfo.put("paper", "339");
        blockInfo.put("book", "340");
        blockInfo.put("slimeball", "341");
        blockInfo.put("minecart_with_chest", "342");
        blockInfo.put("minecart_with_furnace", "343");
        blockInfo.put("egg", "344");
        blockInfo.put("compass", "345");
        blockInfo.put("fishing_rod", "346");
        blockInfo.put("clock", "347");
        blockInfo.put("glowstone_dust", "348");
        blockInfo.put("raw_fish", "349");
        blockInfo.put("raw_salmon", "349:01");
        blockInfo.put("clownfish", "349:02");
        blockInfo.put("pufferfish", "349:03");
        blockInfo.put("cooked_fish", "350");
        blockInfo.put("cooked_salmon", "350:01");
        blockInfo.put("ink_sack", "351");
        blockInfo.put("rose_red", "351:01");
        blockInfo.put("cactus_green", "351:02");
        blockInfo.put("coco_beans", "351:03");
        blockInfo.put("lapis_lazuli", "351:04");
        blockInfo.put("purple_dye", "351:05");
        blockInfo.put("cyan_dye", "351:06");
        blockInfo.put("light_gray_dye", "351:07");
        blockInfo.put("gray_dye", "351:08");
        blockInfo.put("pink_dye", "351:09");
        blockInfo.put("lime_dye", "351:10");
        blockInfo.put("dandelion_yellow", "351:11");
        blockInfo.put("light_blue_dye", "351:12");
        blockInfo.put("magenta_dye", "351:13");
        blockInfo.put("orange_dye", "351:14");
        blockInfo.put("bone_meal", "351:15");
        blockInfo.put("bone", "352");
        blockInfo.put("sugar", "353");
        blockInfo.put("cake", "354");
        blockInfo.put("bed", "355");
        blockInfo.put("redstone_repeater", "356");
        blockInfo.put("cookie", "357");
        blockInfo.put("map", "358");
        blockInfo.put("shears", "359");
        blockInfo.put("melon", "360");
        blockInfo.put("pumpkin_seeds", "361");
        blockInfo.put("melon_seeds", "362");
        blockInfo.put("raw_beef", "363");
        blockInfo.put("steak", "364");
        blockInfo.put("raw_chicken", "365");
        blockInfo.put("cooked_chicken", "366");
        blockInfo.put("rotten_flesh", "367");
        blockInfo.put("ender_pearl", "368");
        blockInfo.put("blaze_rod", "369");
        blockInfo.put("ghast_tear", "370");
        blockInfo.put("gold_nugget", "371");
        blockInfo.put("nether_wart", "372");
        blockInfo.put("potion", "373");
        blockInfo.put("glass_bottle", "374");
        blockInfo.put("spider_eye", "375");
        blockInfo.put("fermented_spider_eye", "376");
        blockInfo.put("blaze_powder", "377");
        blockInfo.put("magma_cream", "378");
        blockInfo.put("brewing_stand", "379");
        blockInfo.put("cauldron", "380");
        blockInfo.put("eye_of_ender", "381");
        blockInfo.put("glistering_melon", "382");
        blockInfo.put("spawn_creeper", "383:50");
        blockInfo.put("spawn_skeleton", "383:51");
        blockInfo.put("spawn_spider", "383:52");
        blockInfo.put("spawn_zombie", "383:54");
        blockInfo.put("spawn_slime", "383:55");
        blockInfo.put("spawn_ghast", "383:56");
        blockInfo.put("spawn_pigman", "383:57");
        blockInfo.put("spawn_enderman", "383:58");
        blockInfo.put("spawn_cave_spider", "383:59");
        blockInfo.put("spawn_silverfish", "384");
        blockInfo.put("spawn_blaze", "384:01");
        blockInfo.put("spawn_magma_cube", "384:02");
        blockInfo.put("spawn_bat", "384:05");
        blockInfo.put("spawn_witch", "384:06");
        blockInfo.put("spawn_endermite", "384:07");
        blockInfo.put("spawn_guardian", "384:08");
        blockInfo.put("spawn_pig", "384:30");
        blockInfo.put("spawn_sheep", "384:31");
        blockInfo.put("spawn_cow", "384:32");
        blockInfo.put("spawn_chicken", "384:33");
        blockInfo.put("spawn_squid", "384:34");
        blockInfo.put("spawn_wolf", "384:35");
        blockInfo.put("spawn_mooshroom", "384:36");
        blockInfo.put("spawn_ocelot", "384:38");
        blockInfo.put("spawn_horse", "384:40");
        blockInfo.put("spawn_rabbit", "384:41");
        blockInfo.put("spawn_villager", "385");
        blockInfo.put("bottle_o'_enchanting", "384");
        blockInfo.put("fire_charge", "385");
        blockInfo.put("book_and_quill", "386");
        blockInfo.put("written_book", "387");
        blockInfo.put("emerald", "388");
        blockInfo.put("item_frame", "389");
        blockInfo.put("flower_pot", "390");
        blockInfo.put("carrot", "391");
        blockInfo.put("potato", "392");
        blockInfo.put("baked_potato", "393");
        blockInfo.put("poisonous_potato", "394");
        blockInfo.put("empty_map", "395");
        blockInfo.put("golden_carrot", "396");
        blockInfo.put("mob_head_skeleton", "397");
        blockInfo.put("mob_head_wither_skeleton", "397:1");
        blockInfo.put("mob_head_zombie", "397:2");
        blockInfo.put("mob_head_human", "397:3");
        blockInfo.put("mob_head_creeper", "397:4");
        blockInfo.put("carrot_on_a_stick", "398");
        blockInfo.put("nether_star", "399");
        blockInfo.put("pumpkin_pie", "400");
        blockInfo.put("firework_rocket", "401");
        blockInfo.put("firework_star", "402");
        blockInfo.put("enchanted_book", "403");
        blockInfo.put("redstone_comparator", "404");
        blockInfo.put("nether_brick", "405");
        blockInfo.put("nether_quartz", "406");
        blockInfo.put("minecart_with_tnt", "407");
        blockInfo.put("minecart_with_hopper", "408");
        blockInfo.put("prismarine_shard", "409");
        blockInfo.put("prismarine_crystals", "410");
        blockInfo.put("raw_rabbit", "411");
        blockInfo.put("cooked_rabbit", "412");
        blockInfo.put("rabbit_stew", "413");
        blockInfo.put("rabbit's_foot", "414");
        blockInfo.put("rabbit_hide", "415");
        blockInfo.put("armor_stand", "416");
        blockInfo.put("iron_horse_armor", "417");
        blockInfo.put("golden_horse_armor", "418");
        blockInfo.put("diamond_horse_armor", "419");
        blockInfo.put("lead", "420");
        blockInfo.put("name_tag", "421");
        blockInfo.put("minecart_with_command_block", "422");
        blockInfo.put("raw_mutton", "423");
        blockInfo.put("cooked_mutton", "424");
        blockInfo.put("banner", "425");
        blockInfo.put("spruce_door", "427");
        blockInfo.put("birch_door", "428");
        blockInfo.put("jungle_door", "429");
        blockInfo.put("acacia_door", "430");
        blockInfo.put("dark_oak_door", "431");
        blockInfo.put("13_disc", "2256");
        blockInfo.put("cat_disc", "2257");
        blockInfo.put("blocks_disc", "2258");
        blockInfo.put("chirp_disc", "2259");
        blockInfo.put("far_disc", "2260");
        blockInfo.put("mall_disc", "2261");
        blockInfo.put("mellohi_disc", "2262");
        blockInfo.put("stal_disc", "2263");
        blockInfo.put("strad_disc", "2264");
        blockInfo.put("ward_disc", "2265");
        blockInfo.put("11_disc", "2266");
        blockInfo.put("wait_disc", "2267");
    }
}