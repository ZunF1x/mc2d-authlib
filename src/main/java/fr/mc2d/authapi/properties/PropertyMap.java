package fr.mc2d.authapi.properties;

import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class PropertyMap extends ForwardingMultimap<String, Property> {

    private final Multimap<String, Property> properties = LinkedHashMultimap.create();

    protected Multimap<String, Property> delegate() {
        return this.properties;
    }
}
