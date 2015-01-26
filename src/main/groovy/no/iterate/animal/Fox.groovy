package no.iterate.animal

import com.google.common.base.Optional
import groovy.transform.Immutable

/**
 *  Represents a four legged bushy tailed creature, with configurable
 *  voice module.
 *
 *  But what does the fox say?
 */
@Immutable
class Fox {

    Closure<String> voiceModule

    Optional<String> says() {
        return Optional.fromNullable(voiceModule?.call())
    }
}
