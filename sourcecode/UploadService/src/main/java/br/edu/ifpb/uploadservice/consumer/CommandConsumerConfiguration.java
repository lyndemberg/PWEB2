package br.edu.ifpb.uploadservice.consumer;

import io.eventuate.tram.commands.consumer.CommandDispatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConsumerConfiguration {

    @Bean
    public CommandConsumerHandler commandConsumerHandler(CommandConsumerParameters parameters){
        return new CommandConsumerHandler(parameters.getCommandChannel());
    }

    @Bean
    public CommandDispatcher commandDispatcher(CommandConsumerParameters parameters, CommandConsumerHandler handler) {
        return new CommandDispatcher(parameters.getDispatcherId(), handler.getCommandHandlers());
    }

    @Bean
    public CommandConsumerParameters commandConsumerParameters() {
        return new CommandConsumerParameters();
    }

}
