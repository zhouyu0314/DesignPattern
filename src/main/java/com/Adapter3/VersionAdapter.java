package com.Adapter3;

/**
 * Adapter
 */
public class VersionAdapter extends NewVersion implements OldVersionTarget {
    @Override
    public void say() {
        super.say();
    }
}
