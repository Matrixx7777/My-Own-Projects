package com.my.task.horus.one;

import com.my.task.horus.one.Block;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}