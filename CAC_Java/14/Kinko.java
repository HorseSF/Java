class Kinko implements Lockable {
    @Override
    public boolean lock() {
        return true;
    }

    @Override
    public boolean unlock() {
        return false;
    }
}
