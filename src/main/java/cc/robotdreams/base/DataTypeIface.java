package cc.robotdreams.base;

public interface DataTypeIface  // must be ended by able, ible - examples: Closeable, Iterable
                                // noun - DataType, Apple
{
    // all methods abstract public
    String getTypeName();
    Object getValue();
    void add(String value);
}
