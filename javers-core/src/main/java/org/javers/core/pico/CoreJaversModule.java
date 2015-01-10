package org.javers.core.pico;

import org.javers.common.date.DefaultDateProvider;
import org.javers.core.GraphFactory;
import org.javers.core.Javers;
import org.javers.core.JaversCoreConfiguration;
import org.javers.core.diff.DiffFactory;
import org.javers.core.graph.LiveCdoFactory;
import org.javers.core.graph.LiveGraphFactory;
import org.javers.core.graph.ObjectGraphBuilder;
import org.javers.core.json.JsonConverterBuilder;
import org.javers.core.metamodel.object.GlobalIdFactory;
import org.javers.core.metamodel.type.TypeFactory;
import org.javers.core.metamodel.type.TypeMapper;
import org.javers.core.snapshot.GraphShadowFactory;
import org.javers.core.snapshot.GraphSnapshotFactory;
import org.javers.core.snapshot.SnapshotDiffer;
import org.javers.core.metamodel.object.SnapshotFactory;
import org.javers.repository.api.JaversExtendedRepository;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Piotr Betkier
 */
public class CoreJaversModule implements JaversModule {

    private static final Class[] moduleComponents = new Class[]{
            Javers.class,
            DiffFactory.class,
            ObjectGraphBuilder.class,
            JsonConverterBuilder.class,
            TypeMapper.class,
            TypeFactory.class,
            JaversCoreConfiguration.class,
            SnapshotFactory.class,
            GraphSnapshotFactory.class,
            GraphShadowFactory.class,
            JaversExtendedRepository.class,
            LiveCdoFactory.class,
            LiveGraphFactory.class,
            GlobalIdFactory.class,
            GraphFactory.class,
            DefaultDateProvider.class,
            SnapshotDiffer.class
    };

    @Override
    public Collection<Class> getComponents() {
        return Arrays.asList(moduleComponents);
    }
}
