package br.edu.ifpb.producer.commandproducer;

public class CommandConsumerParameters {
  private String commandChannel = "uploadServiceCommandChannel";
  private String replyChannel = "uploadServiceReplyChannel";
  private String dispatcherId = "uploadDispatcher1";
  private String aggregateType = "conteudo";

  public String getCommandChannel() {
    return commandChannel;
  }

  public void setCommandChannel(String commandChannel) {
    this.commandChannel = commandChannel;
  }

  public String getReplyChannel() {
    return replyChannel;
  }

  public void setReplyChannel(String replyChannel) {
    this.replyChannel = replyChannel;
  }

  public String getDispatcherId() {
    return dispatcherId;
  }

  public void setDispatcherId(String dispatcherId) {
    this.dispatcherId = dispatcherId;
  }

  public String getAggregateType() {
    return aggregateType;
  }

  public void setAggregateType(String aggregateType) {
    this.aggregateType = aggregateType;
  }
}
