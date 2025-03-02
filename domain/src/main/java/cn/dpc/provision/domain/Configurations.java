package cn.dpc.provision.domain;

import cn.dpc.provision.domain.Configuration.ConfigurationId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface Configurations {
    Flux<Configuration> findAllByType(String type);

    Mono<Configuration> getById(ConfigurationId id);

    Mono<Configuration> add(Configuration configuration);

    Mono<Configuration> update(ConfigurationId id, Configuration configuration);

    Mono<Void> publish(ConfigurationId id);

    Mono<Void> disable(ConfigurationId id);

    Mono<Void> delete(ConfigurationId id);

    Flux<Configuration> findAllPublishedByType(String type);

    Mono<Void> priority(List<ConfigurationId> ids);
}
